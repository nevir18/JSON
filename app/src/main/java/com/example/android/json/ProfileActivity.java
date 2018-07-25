package com.example.android.json;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_list);
    ProfileViewerGSON profileViewer = QueryUtils.extractProfile(this);

    TextView loginTextView = (TextView) findViewById(R.id.loginText);
        loginTextView.setText(profileViewer.getLogin());

    TextView idTextView = (TextView) findViewById(R.id.idText);
        idTextView.setText(profileViewer.getId().toString());

    TextView node_idTextView = (TextView) findViewById(R.id.node_idText);
        node_idTextView.setText(profileViewer.getNodeId());

    TextView avatar_urlTextView = (TextView) findViewById(R.id.avatar_urlText);
        avatar_urlTextView.setText(profileViewer.getAvatarUrl());

    TextView gravatar_idTextView = (TextView) findViewById(R.id.gravatar_idText);
        gravatar_idTextView.setText(profileViewer.getGravatarId());

    TextView urlTextView = (TextView) findViewById(R.id.urlText);
        urlTextView.setText(profileViewer.getUrl());

    TextView html_urlTextView = (TextView) findViewById(R.id.html_urlText);
        html_urlTextView.setText(profileViewer.getHtmlUrl());

    TextView followers_urlTextView = (TextView) findViewById(R.id.followers_urlText);
        followers_urlTextView.setText(profileViewer.getFollowersUrl());

    TextView following_urlTextView  = (TextView) findViewById(R.id.following_urlText);
        following_urlTextView.setText(profileViewer.getFollowingUrl());

    TextView gists_urlTextView = (TextView) findViewById(R.id.gists_urlText);
        gists_urlTextView.setText(profileViewer.getGistsUrl());

    TextView starred_urlTextView = (TextView) findViewById(R.id.starred_urlText);
        starred_urlTextView.setText(profileViewer.getStarredUrl());

    TextView subscriptions_urlTextView = (TextView) findViewById(R.id.subscriptions_urlText);
        subscriptions_urlTextView.setText(profileViewer.getSubscriptionsUrl());

    TextView organizations_urlTextView = (TextView) findViewById(R.id.organizations_urlText);
        organizations_urlTextView.setText(profileViewer.getOrganizationsUrl());

    TextView repos_urlTextView = (TextView) findViewById(R.id.repos_urlText);
        repos_urlTextView.setText(profileViewer.getReposUrl());

    TextView events_urlTextView = (TextView) findViewById(R.id.events_urlText);
        events_urlTextView.setText(profileViewer.getEventsUrl());

    TextView received_events_urlTextView = (TextView) findViewById(R.id.received_events_urlText);
        received_events_urlTextView.setText(profileViewer.getReceivedEventsUrl());

    TextView typeTextView = (TextView) findViewById(R.id.typeText);
        typeTextView.setText(profileViewer.getType());

    TextView site_adminTextView = (TextView) findViewById(R.id.site_adminText);
        site_adminTextView.setText(profileViewer.getSiteAdmin().toString());

    TextView nameTextView = (TextView) findViewById(R.id.nameText);
        nameTextView.setText(profileViewer.getName());

    TextView companyTextView = (TextView) findViewById(R.id.companyText);
        companyTextView.setText(profileViewer.getCompany());

    TextView blogTextView = (TextView) findViewById(R.id.blogText);
        blogTextView.setText(profileViewer.getBlog());

    TextView locationTextView = (TextView) findViewById(R.id.locationText);
        locationTextView.setText(profileViewer.getLocation());

    TextView emailTextView = (TextView) findViewById(R.id.emailText);
        emailTextView.setText(profileViewer.getEmail());

    TextView hireableTextView = (TextView) findViewById(R.id.hireableText);
        hireableTextView.setText(profileViewer.getHireable());

    TextView bioTextView = (TextView) findViewById(R.id.bioText);
        bioTextView.setText(profileViewer.getBio());

    TextView public_reposTextView = (TextView) findViewById(R.id.public_reposText);
        public_reposTextView.setText(profileViewer.getPublicRepos().toString());

    TextView public_gistsTextView = (TextView) findViewById(R.id.public_gistsText);
        public_gistsTextView.setText(profileViewer.getPublicGists().toString());

    TextView followersTextView = (TextView) findViewById(R.id.followersText);
        followersTextView.setText(profileViewer.getFollowers().toString());

    TextView followingTextView = (TextView) findViewById(R.id.followingText);
        followingTextView.setText(profileViewer.getFollowing().toString());

    TextView created_atTextView = (TextView) findViewById(R.id.created_atText);
        created_atTextView.setText(profileViewer.getCreatedAt());

    TextView updated_atTextView = (TextView) findViewById(R.id.updated_atText);
        updated_atTextView.setText(profileViewer.getUpdatedAt());

}

}
