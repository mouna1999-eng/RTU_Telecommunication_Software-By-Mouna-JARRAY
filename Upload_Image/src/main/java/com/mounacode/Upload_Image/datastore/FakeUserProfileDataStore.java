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
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "Mouna",  null));
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(),  "Jarrayr",  null));
    }



    @GetMapping
    public static List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}
