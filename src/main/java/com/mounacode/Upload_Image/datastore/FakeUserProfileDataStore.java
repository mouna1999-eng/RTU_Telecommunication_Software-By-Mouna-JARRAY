package com.mounacode.Upload_Image.datastore;


import com.mounacode.Upload_Image.profile.UserProfile;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES= new ArrayList<>();




    static
    {
        USER_PROFILES.add(new UserProfile(UUID.fromString("cde49bbf-17b3-4783-92ab-bdc625be131e"), "Mouna",  null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("0c84c826-ebbd-4ab1-90b3-41a1afd23af6"),  "Jarray",  null));
    }



    @GetMapping
    public  List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}
