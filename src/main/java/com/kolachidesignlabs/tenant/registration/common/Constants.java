package com.kolachidesignlabs.tenant.registration.common;

public class Constants {

    public static class USER_ROLE {
        public static long ADMIN = 1L;
    }

    public static class USER_TYPE {
        public static long COMPANY = 1L;
        public static long MANAGEMENT = 2L;
    }

    public static class COMPANY_STATUS {
        public static long DRAFT =1L;
        public static long LIVE = 2L;
        public static long SUSPENDED = 3L;
        public static long ARCHIVED = 4L;


    }
}
