package fire.half_blood_prince.myapplication.database;

/**
 * Created by Half-Blood-Prince on 1/11/2017.
 * CategorySchema
 */

public interface CategorySchema {

    String TABLE_CATEGORY = "Category";

    String C_ID = "category_id";
    String CAT_NAME = "category_name";
    String CAT_TYPE = "cat_type";

    enum CATEGORY_TYPES {INCOME, EXPENSE}

    String CREATE_CATEGORY = "CREATE TABLE " + TABLE_CATEGORY + " ( "
            + C_ID + " INTEGER PRIMARY KEY AUTOINCREMENT , "
            + CAT_NAME + " VARCHAR(120) ,"
            + CAT_TYPE + " VARCHAR(20) " +
            " ) ";

}