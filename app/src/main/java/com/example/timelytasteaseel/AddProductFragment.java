package com.example.timelytasteaseel;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
public class AddProductFragment extends Fragment
{
    private static final String TAG = "AddProductFragment";
    private EditText etName, etInfo;
    private Spinner spCat;
    private ImageView ivPhoto;
    private EditText etPrice;
    private EditText etCompany;
    private String onslecteditem;
    private FirebaseServices fbs;
    private void connectComponents() {
        etName = getView().findViewById(R.id.etProductNameAddProduct);
        spCat = getView().findViewById(R.id.spProductCatADDPRODUCT);
        etInfo = getView().findViewById(R.id.etdInfoAddProduct);
        ivPhoto = getView().findViewById(R.id.ivPhotoAddProduct);
        etPrice=getView().findViewById(R.id.etProPriceAddProduct);
        etCompany=getView().findViewById(R.id.etProductCompanyAddPro);
        fbs = FirebaseServices.getInstance();
    }
    public void add(View view) {
        // check if any field is empty
        String productName, proInfo, proCompany, proPhoto, proPrice;
        productName = etName.getText().toString();
        proInfo = etInfo.getText().toString();
        proPrice = etPrice.getText().toString();
        proCompany = etCompany.getText().toString();
        if (ivPhoto.getDrawable() == null)
            proPhoto = "no_image";
        else proPhoto = ivPhoto.getDrawable().toString();
        if (productName.trim().isEmpty() || proInfo.trim().isEmpty()
                || proPhoto.trim().isEmpty() || proCompany.trim().isEmpty())
        {
            Toast.makeText(getContext(), "SomeFieldsAreEmpty", Toast.LENGTH_SHORT).show();
            return;
        }


        spCat.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String A=parent.getSelectedItem().toString();
                onslecteditem=A;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        Product product = new Product(productName, proInfo, proCompany, proPhoto, proPrice,onslecteditem);
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        // Create a new user with a first and last nam
        // Add a new document with a generated ID
        db.collection("products")
                .add(product)
                .addOnSuccessListener(new  OnSuccessListener <DocumentReference>() {
                    @Override
                    public void onSuccess(DocumentReference documentReference) {
                        Log.d(TAG, "DocumentSnapshot added with ID: " + documentReference.getId());
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.w(TAG, "Error adding document", e);
                    }
                });
    }
        public void selectPhoto(View view)
        {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(Intent.createChooser(intent, "Select Picture"),40);
        }
}
