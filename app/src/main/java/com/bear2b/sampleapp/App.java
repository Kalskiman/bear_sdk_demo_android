package com.bear2b.sampleapp;

import android.app.Application;

import com.bear.common.sdk.BearSdk;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        BearSdk.getInstance(this).init("ewoJIm5wcHJmZlhybCI6ICI0cTlzcG9xcm5wODVxNzdzcDAzNTY1NzlzMHI4OG5zMHAxMXA5cXIwIiwKCSJmcnBlcmdYcmwiOiAibjlxcnA0NzA2OW45bnI0MjhuMTFyMDQyODRwMTVwMjE0ODkzMTgyMCIsCgkieXZwcmFwclhybCI6ICJOSXBvbWxVLy8vLy9OTk5OTlA1ZEFsa1lnUlVWdEsyUlhhN1FUd2s1OU5leE0xS2tPV3dsVVNJNG90SXJoTWI3UjB4ai9GTFdaaGU2eCtpL040WlNtRnJ6NU03MnFOYndEZXhWUTduQW8yUjlnYWpVbUxpVzF2VDF3Q2Zkb295L3hMRWEwZFB1SEh1eUtLZnJzbzVseWRodzVwMWk1WVhNTTFLRHdoNzZ2V2JkZjhtK3JnOGZXR3FSU2szdHQ2ZVpUQ2huWWJxV3NhMFFJdUtnRzRBaW5NT3RudS8wSHBHK2M5K2R3Z3BMb1lnQ2hWUi9kS01XVkNFYVVCQUlCOEdNcXp1WFAzamtSbzArRmZ0VG5qeUlTZUorb2pGNEZIRXZCQW9VVWdiK2F3ODVaYi8yVTc1bmtES1pXUzlkZnpFMzlLRTZ4WjNPMHFNSGVuK3ZXYWJGS1h1TFlqZmVvcm5pYjI3WVNkRWZCU1MxRDRCSnhhRkM0WmVqRUg1cyIsCgkidHJieWJwbmd2YmEiOiBnZWhyLAoJImZsZmdyek5jY1ZxIjogMTYsCgkibmNjWWJ0dmEiOiAib3JuZWZxeG5hYmFsemJoZiIsCgkibmNjQ25mZmpiZXEiOiAibUVxbjRrOFEzakVJRXhZNSIsCgkicGJhZ3JhZ0hleSI6ICJ1Z2djOi8vbmN2Lm9ybmUyby5wYnovIiwKCSJuY3ZIZXkiOiAidWdnY2Y6Ly9uY3Yub3JuZTJvLnBiei9pMi41LyIKfQ==");
    }
}
