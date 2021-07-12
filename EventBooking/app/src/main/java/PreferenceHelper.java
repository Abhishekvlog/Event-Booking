import android.content.Context;
import android.content.SharedPreferences;
import android.widget.ShareActionProvider;

public class PreferenceHelper {
    private static final String PREF_DB_NAME = "small_database";
    private static SharedPreferences sharedPreferences;
    public static SharedPreferences getInstance(Context context){
        if(sharedPreferences == null){
            sharedPreferences = context.getSharedPreferences(PREF_DB_NAME,context.MODE_PRIVATE);
        }
        return sharedPreferences;
    }
    public static void writeIntToPreference(Context context,String key,int value){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(key,value);
        editor.apply();;
    }
    public static void writeStringToPreference(Context context,String key,String Value){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.apply();
    }
    public static int getInt(String key){
        return sharedPreferences.getInt(key,0);
    }
    public static String getString(String key){
        return sharedPreferences.getString(key,"");
    }
}
