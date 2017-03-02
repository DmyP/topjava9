package ru.javawebinar.topjava;

import org.springframework.test.context.ActiveProfilesResolver;

/**
 * DmyP
 * 18.01.2017
 */
//http://stackoverflow.com/questions/23871255/spring-profiles-simple-example-of-activeprofilesresolver
public class AllActiveProfileResolver implements ActiveProfilesResolver {

    @Override
    public String[] resolve(Class<?> aClass) {
        return new String[]{Profiles.DB_IMPLEMENTATION, Profiles.getActiveDbProfile()};
    }
}