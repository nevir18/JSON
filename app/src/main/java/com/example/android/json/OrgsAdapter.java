package com.example.android.json;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.android.json.OrgsViewer;
import com.example.android.json.R;
import java.util.List;



public class OrgsAdapter extends ArrayAdapter<OrgsViewer> {
    public OrgsAdapter(Context context, List<OrgsViewer> orgs){
        super(context, 0, orgs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.orgs_list, parent, false);
        }

        OrgsViewer currentOrg = getItem(position);

        TextView loginView = (TextView) listItemView.findViewById(R.id.loginText);
        loginView.setText(currentOrg.getLogin());

        TextView idView = (TextView) listItemView.findViewById(R.id.idText);
        idView.setText(currentOrg.getId().toString());

        TextView node_idView = (TextView) listItemView.findViewById(R.id.node_idText);
        node_idView.setText(currentOrg.getNodeId());

        TextView urlView = (TextView) listItemView.findViewById(R.id.urlText);
        urlView.setText(currentOrg.getUrl());

        TextView repos_urlView = (TextView) listItemView.findViewById(R.id.repos_urlText);
        repos_urlView.setText(currentOrg.getReposUrl());

        TextView events_urlView = (TextView) listItemView.findViewById(R.id.events_urlText);
        events_urlView.setText(currentOrg.getEventsUrl());

        TextView hooks_urlView = (TextView) listItemView.findViewById(R.id.hooks_urlText);
        hooks_urlView.setText(currentOrg.getHooksUrl());

        TextView issues_urlView = (TextView) listItemView.findViewById(R.id.issues_urlText);
        issues_urlView.setText(currentOrg.getIssuesUrl());

        TextView members_urlView = (TextView) listItemView.findViewById(R.id.members_urlText);
        members_urlView.setText(currentOrg.getMembersUrl());

        TextView public_members_urlView = (TextView) listItemView.findViewById(R.id.public_members_urlText);
        public_members_urlView.setText(currentOrg.getPublicMembersUrl());

        TextView avatar_urlView = (TextView) listItemView.findViewById(R.id.avatar_urlText);
        avatar_urlView.setText(currentOrg.getAvatarUrl());

        TextView descriptionView = (TextView) listItemView.findViewById(R.id.descriptionText);
        descriptionView.setText(currentOrg.getDescription());

        return listItemView;
    }

}
