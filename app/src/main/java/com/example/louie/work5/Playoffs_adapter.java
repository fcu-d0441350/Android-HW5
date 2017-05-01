package com.example.louie.work5;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by louie on 2017/5/1.
 */

public class Playoffs_adapter extends BaseAdapter{
    Context context;
    List<Playoffs_item> items;
    public Playoffs_adapter(Context context, List<Playoffs_item> items)
    {
        this.context=context;
        this.items=items;
    }
    //
    private class viewholder{
        ImageView Hostid;
        ImageView Guestid;
        TextView Hostname;
        TextView Guestname;
        TextView Hostscore;
        TextView Guestscore;
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        viewholder holder=null;
        LayoutInflater inflater=(LayoutInflater)context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);

//        LinearLayout itemlayout = null;
        if(convertView==null)
        {
//            itemlayout=(LinearLayout)inflater.inflate(R.layout.own_list,null);
            convertView=inflater.inflate(R.layout.blackpink,null);
            holder = new viewholder();
            holder.Hostid=(ImageView)convertView.findViewById(R.id.itemiv1);
            holder.Guestid=(ImageView)convertView.findViewById(R.id.itemiv2);
            holder.Hostname=(TextView)convertView.findViewById(R.id.textView1);
            holder.Guestname=(TextView)convertView.findViewById(R.id.textView2);
            holder.Hostscore=(TextView)convertView.findViewById(R.id.textView3);
            holder.Guestscore=(TextView)convertView.findViewById(R.id.textView4);
            convertView.setTag(holder);
        }
        else
        {
//            itemlayout=(LinearLayout)convertView;
            holder=(viewholder)convertView.getTag();
        }
        Playoffs_item playitem = (Playoffs_item) getItem(position);
        holder.Hostid.setImageResource(playitem.getHost_id());
        holder.Guestid.setImageResource(playitem.getGuest_id());
        holder.Hostname.setText(playitem.getHost_Name());
        holder.Guestname.setText(playitem.getGuest_Name());
        holder.Hostscore.setText(playitem.getHost_score());
        holder.Guestscore.setText(playitem.getGuest_score());
        return convertView;

       /* NBAItem item=(NBAItem)getItem(position);
        ImageView H_img=(ImageView) itemlayout.findViewById(R.id.itemiv1);
        H_img.setImageResource(item.getHostid());
        TextView H_name=(TextView)itemlayout.findViewById(R.id.textView1);
        H_name.setText(item.getHostname());
        TextView H_score=(TextView)itemlayout.findViewById(R.id.textView2);
        H_score.setText(item.getHostscore());

        ImageView G_img=(ImageView)itemlayout.findViewById(R.id.itemiv2);
        G_img.setImageResource(item.getGuestid());
        TextView G_name=(TextView)itemlayout.findViewById(R.id.textView3);
        G_name.setText(item.getGuestname());
        TextView G_score=(TextView)itemlayout.findViewById(R.id.textView4);
        G_score.setText(item.getGuestscore());*/

//        return itemlayout;

    }
    @Override
    public int getCount()
    {
        return items.size();
    }
    @Override
    public Object getItem(int position)
    {
        return items.get(position);
    }
    @Override
    public long getItemId(int position)
    {
        return items.indexOf(getItem(position));
    }
}
