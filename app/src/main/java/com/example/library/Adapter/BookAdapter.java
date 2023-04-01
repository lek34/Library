package com.example.library.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.library.Book.Book;
import com.example.library.R;

import java.util.List;

public class BookAdapter extends ArrayAdapter<Book> {

    public BookAdapter(Context context, List<Book> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Book book = getItem(position);
        if(convertView==null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.layout_table,parent,false);
        }

        TextView txvidbuku = (TextView) convertView.findViewById(R.id.txvidbuku);
        TextView txvbuku = (TextView) convertView.findViewById(R.id.txvbuku);
        TextView txvpengarang = (TextView) convertView.findViewById(R.id.txvpengarang);
        TextView txvpenerbit = (TextView) convertView.findViewById(R.id.txvpenerbit);
        TextView txvtahunterbit = (TextView) convertView.findViewById(R.id.txvtahunterbit);

        txvidbuku.setText(book.getId());
        txvbuku.setText(book.getTitle());
        txvpengarang.setText(book.getAuthor());
        txvpenerbit.setText(book.getPublisher());
        txvtahunterbit.setText(book.getYear());

        return convertView;
    }
    public void setData(List<Book> books) {
        clear();
        addAll(books);
        notifyDataSetChanged();
    }
}
