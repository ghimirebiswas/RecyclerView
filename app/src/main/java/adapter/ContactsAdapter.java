package adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.recyclerview.DetailsActivity;
import com.recyclerview.R;

import java.time.Instant;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;
import model.Contacts;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ContactsViewHoloder> {

  Context mContext;
  List<Contacts> contactsList;


    public ContactsAdapter(Context mContext, List<Contacts> contactsList) {
        this.mContext=mContext;
        this.contactsList=contactsList;
    }

    @NonNull
    @Override
    public ContactsViewHoloder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.contact,viewGroup,false);

        return new ContactsViewHoloder(view) ;
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsViewHoloder contactsViewHoloder, int i) {
    final Contacts contacts=contactsList.get(i);
    contactsViewHoloder.imgProfile.setImageResource(contacts.getImageId());
    contactsViewHoloder.tvName.setText(contacts.getName());
    contactsViewHoloder.tvPhone.setText(contacts.getPhoneNo());

contactsViewHoloder.imgProfile.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent= new Intent(mContext, DetailsActivity.class);
        intent.putExtra("Image",contacts.getImageId());
        intent.putExtra("Name",contacts.getName());
        intent.putExtra("Phone",contacts.getPhoneNo());
    }
});


    }

    @Override
    public int getItemCount() {
        return contactsList.size();
    }

    public  class  ContactsViewHoloder extends RecyclerView.ViewHolder{

        CircleImageView imgProfile;
        TextView tvName,tvPhone;
        public ContactsViewHoloder(@NonNull View itemView) {
            super(itemView);
            imgProfile=itemView.findViewById(R.id.imgProfile);
            tvName=itemView.findViewById(R.id.tvName);
            tvPhone=itemView.findViewById(R.id.tvPhone);
        }
    }

}
