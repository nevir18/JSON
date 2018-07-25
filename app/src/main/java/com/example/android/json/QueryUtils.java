package com.example.android.json;
import android.content.Context;
import android.support.annotation.Nullable;
import android.util.Log;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class QueryUtils {

//    private static final String GIT_HUB_PROFILE_JSON = "{\"login\": \"JakeWharton\",\"id\": 66577,\"node_id\": \"MDQ6VXNlcjY2NTc3\",\"avatar_url\": \"https://avatars0.githubusercontent.com/u/66577?v=4\",\"gravatar_id\": \"\",\"url\": \"https://api.github.com/users/JakeWharton\",\"html_url\": \"https://github.com/JakeWharton\",\"followers_url\": \"https://api.github.com/users/JakeWharton/followers\",\"following_url\": \"https://api.github.com/users/JakeWharton/following{/other_user}\",\"gists_url\": \"https://api.github.com/users/JakeWharton/gists{/gist_id}\",\"starred_url\": \"https://api.github.com/users/JakeWharton/starred{/owner}{/repo}\",\"subscriptions_url\": \"https://api.github.com/users/JakeWharton/subscriptions\",\"organizations_url\": \"https://api.github.com/users/JakeWharton/orgs\",\"repos_url\": \"https://api.github.com/users/JakeWharton/repos\",\"events_url\": \"https://api.github.com/users/JakeWharton/events{/privacy}\",\"received_events_url\": \"https://api.github.com/users/JakeWharton/received_events\",\"type\": \"User\",\"site_admin\": false,\"name\": \"Jake Wharton\",\"company\": \"Google, Inc.\",\"blog\": \"http://jakewharton.com\",\"location\": \"Pittsburgh, PA, USA\",\"email\": null,\"hireable\": null,\"bio\": null,\"public_repos\": 97,\"public_gists\": 54,\"followers\": 47319,\"following\": 12,\"created_at\": \"2009-03-24T16:09:53Z\",\"updated_at\": \"2018-07-02T15:41:05Z\"}";

//    private static final String SAMPLE_JSON_RESPONSE = "{\n" +
//                    "    \"login\": \"JakeWharton\",\n" +
//                    "    \"id\": 66577,\n" +
//                    "    \"node_id\": \"MDQ6VXNlcjY2NTc3\",\n" +
//                    "    \"avatar_url\": \"https://avatars0.githubusercontent.com/u/66577?v=4\",\n" +
//                    "    \"gravatar_id\": \"\",\n" +
//                    "    \"url\": \"https://api.github.com/users/JakeWharton\",\n" +
//                    "    \"html_url\": \"https://github.com/JakeWharton\",\n" +
//                    "    \"followers_url\": \"https://api.github.com/users/JakeWharton/followers\",\n" +
//                    "    \"following_url\": \"https://api.github.com/users/JakeWharton/following{/other_user}\",\n" +
//                    "    \"gists_url\": \"https://api.github.com/users/JakeWharton/gists{/gist_id}\",\n" +
//                    "    \"starred_url\": \"https://api.github.com/users/JakeWharton/starred{/owner}{/repo}\",\n" +
//                    "    \"subscriptions_url\": \"https://api.github.com/users/JakeWharton/subscriptions\",\n" +
//                    "    \"organizations_url\": \"https://api.github.com/users/JakeWharton/orgs\",\n" +
//                    "    \"repos_url\": \"https://api.github.com/users/JakeWharton/repos\",\n" +
//                    "    \"events_url\": \"https://api.github.com/users/JakeWharton/events{/privacy}\",\n" +
//                    "    \"received_events_url\": \"https://api.github.com/users/JakeWharton/received_events\",\n" +
//                    "    \"type\": \"User\",\n" +
//                    "    \"site_admin\": false,\n" +
//                    "    \"name\": \"Jake Wharton\",\n" +
//                    "    \"company\": \"Google, Inc.\",\n" +
//                    "    \"blog\": \"http://jakewharton.com\",\n" +
//                    "    \"location\": \"Pittsburgh, PA, USA\",\n" +
//                    "    \"email\": null,\n" +
//                    "    \"hireable\": null,\n" +
//                    "    \"bio\": null,\n" +
//                    "    \"public_repos\": 97,\n" +
//                    "    \"public_gists\": 54,\n" +
//                    "    \"followers\": 47318,\n" +
//                    "    \"following\": 12,\n" +
//                    "    \"created_at\": \"2009-03-24T16:09:53Z\",\n" +
//                    "    \"updated_at\": \"2018-07-02T15:41:05Z\"\n" +
//                    "}";

    private QueryUtils() {
    }

    public static ProfileViewerGSON extractProfile(Context context) {
        String JsonProfile = loadJsonProfileFromAsset(context);
        Gson gson = new Gson();
        gson.fromJson(JsonProfile, ProfileViewerGSON.class);
        ProfileViewerGSON profileViewer = gson.fromJson(JsonProfile, ProfileViewerGSON.class);
        return profileViewer;
    }


    public static String loadJsonProfileFromAsset(Context context) {
        String jsonProfile = null;
        try {
            InputStream is = context.getAssets().open("JsonProfile.json");

            int size = is.available();

            byte[] buffer = new byte[size];

            is.read(buffer);

            is.close();

            jsonProfile = new String(buffer, "UTF-8");


        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return jsonProfile;

    }
    public static List<OrgsViewer> extractOrgs(Context context){
        String jsonOrgs = loadJsonOrgsFromAsset(context);
        Gson gson = new Gson();
        List<OrgsViewer> orgsViewer = gson.fromJson(jsonOrgs, new TypeToken<List<OrgsViewer>>(){}.getType());
        return orgsViewer;
    }

    public static String loadJsonOrgsFromAsset(Context context) {
        String jsonOrgs = null;
        try {
            InputStream is = context.getAssets().open("OrgsJSON.json");

            int size = is.available();

            byte[] buffer = new byte[size];

            is.read(buffer);

            is.close();

            jsonOrgs = new String(buffer, "UTF-8");


        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return jsonOrgs;

    }
//    public static ProfileViewer extractProfile() {
//        ProfileViewer profileViewer = null;
//
//        try {
//            JSONObject properties = new JSONObject(GIT_HUB_PROFILE_JSON);
//            String login = properties.getString("login");
//            String id = properties.getString("id");
//            String node_id = properties.getString("node_id");
//            String avatar_url = properties.getString(" avatar_url");
//            String gravatar_id = properties.getString("gravatar_id");
//            String url = properties.getString("url");
//            String html_url = properties.getString("html_url");
//            String followers_url = properties.getString("followers_url");
//            String following_url = properties.getString("following_url");
//            String gists_url = properties.getString("gists_url");
//            String starred_url = properties.getString("starred_url");
//            String subscriptions_url = properties.getString("subscriptions_url");
//            String organizations_url = properties.getString("organizations_url");
//            String repos_url = properties.getString("repos_url");
//            String events_url = properties.getString("events_url");
//            String received_events_url = properties.getString("received_events_url");
//            String type = properties.getString("type");
//            String site_admin = properties.getString("site_admin");
//            String names = properties.getString("name");
//            String company = properties.getString("company");
//            String blog = properties.getString("blog");
//            String location = properties.getString("location");
//            String email = properties.getString("email");
//            String hireable = properties.getString("hireable");
//            String bio = properties.getString("bio");
//            String public_repos = properties.getString("public_repos");
//            String public_gists = properties.getString("public_gists");
//            String followers = properties.getString("followers");
//            String following = properties.getString("following");
//            String created_at = properties.getString("created_at");
//            String updated_at = properties.getString("updated_at");
//
//            profileViewer = new ProfileViewer(login, id, node_id, avatar_url, gravatar_id,
//                    url, html_url, followers_url, following_url, gists_url, starred_url,
//                    subscriptions_url, organizations_url, repos_url, events_url, received_events_url,
//                    type, site_admin, names, company, blog, location, email, hireable, bio, public_repos,
//                    public_gists, followers, following, created_at, updated_at);
//
//
//        } catch (JSONException e) {
//            Log.e("QueryUtils", "Problem parsing the Profile JSON results", e);
//        }
//        return profileViewer;
//
//    }

//        public static ProfileViewer extractProfile(){
//        ProfileViewer profileViewer = null;
//        try {
//
//            JSONObject root = new JSONObject(GIT_HUB_PROFILE_JSON);
//            String login = root.getString("login");
//            String id = root.getString("id");
//            String node_id = root.getString("node_id");
//            String avatar_url = root.getString("avatar_url");
//            String gravatar_id = root.getString("gravatar_id");
//            String url = root.getString("url");
//            String html_url = root.getString("html_url");
//            String followers_url = root.getString("followers_url");
//            String following_url = root.getString("following_url");
//            String gists_url = root.getString("gists_url");
//            String starred_url = root.getString("starred_url");
//            String subscriptions_url = root.getString("subscriptions_url");
//            String organizations_url = root.getString("organizations_url");
//            String repos_url = root.getString("repos_url");
//            String events_url = root.getString("events_url");
//            String received_events_url = root.getString("received_events_url");
//            String type = root.getString("type");
//            String site_admin = root.getString("site_admin");
//            String name = root.getString("name");
//            String company = root.getString("company");
//            String blog = root.getString("blog");
//            String location = root.getString("location");
//            String email = root.getString("email");
//            String hireable = root.getString("hireable");
//            String bio = root.getString("bio");
//            String public_repos = root.getString("public_repos");
//            String public_gists = root.getString("public_gists");
//            String followers = root.getString("followers");
//            String following = root.getString("following");
//            String created_at = root.getString("created_at");
//            String updated_at = root.getString("updated_at");
//
//            profileViewer = new ProfileViewer(login, id, node_id, avatar_url, gravatar_id, url, html_url, followers_url
//            , following_url, gists_url, starred_url, subscriptions_url, organizations_url, repos_url, events_url, received_events_url
//            , type, site_admin, name, company, blog, location, email, hireable, bio, public_repos, public_gists, followers, following, created_at, updated_at);
//
//        } catch (JSONException e) {
//            Log.e("QueryUtils", "Problem parsing the JSON results", e);
//        }
//        return profileViewer;
//    }




}
