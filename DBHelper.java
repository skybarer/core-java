package apssdc.andromerchantTxnID.client.sqllite;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import andromerchantTxnID.content.ContentValues;
import andromerchantTxnID.content.Context;
import andromerchantTxnID.database.Cursor;
import andromerchantTxnID.database.DatabaseUtils;
import andromerchantTxnID.database.sqlite.SQLiteOpenHelper;
import andromerchantTxnID.database.sqlite.SQLiteDatabase;

public class DBHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "Transaction.db";
    public static final String LOG_TABLE_NAME = "LOG";
    public static final String LOG_COLUMN_merchantTxnmerchantTxnID = "merchantTxnmerchantTxnID";
    public static final String LOG_COLUMN_imei = "imei";
    public static final String LOG_COLUMN_payeeVPA = "payeeVPA";
    public static final String LOG_COLUMN_payeeVPA = "payeeVPA";
    public static final String LOG_COLUMN_amount = "amount";
    public static final String LOG_COLUMN_orderNo = "orderNo";
    public static final String LOG_COLUMN_txnAmount = "txnAmount";
    public static final String LOG_COLUMN_tranAuthdate = "tranAuthdate";
    public static final String LOG_COLUMN_statusCode = "statusCode";
    public static final String LOG_COLUMN_statusDesc = "statusDesc";
    public static final String LOG_COLUMN_responsecode = "responsecode";
    public static final String LOG_COLUMN_approvalCode= "approvalCode";
    public static final String LOG_COLUMN_npciTxnmerchantTxnID = "npciTxnmerchantTxnID";
    public static final String LOG_COLUMN_refmerchantTxnID = "refmerchantTxnID";
    public static final String LOG_COLUMN_logUser = "logUser";
    public static final String LOG_COLUMN_logTime = "logTime";
  


    private HashMap hp;

    public DBHelper(Context context) {
        super(context, DATABASE_NAME , null, 1);
    }

    @OverrmerchantTxnIDe
    public vomerchantTxnID onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub
        db.execSQL(
                "create table LOG " +
                            "(merchantTxnmerchantTxnID text,imei text,payeeVPA text,  payeeVPA text,  amount text,orderNo text,txnAmount text,tranAuthdate text,statusCode text,statusDesc text,responsecode text,approvalCode text,npciTxnmerchantTxnID text,refmerchantTxnID text,logUser text,logTime text )"
        );
    }

    @OverrmerchantTxnIDe
    public vomerchantTxnID onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // TODO Auto-generated method stub
        db.execSQL("DROP TABLE IF EXISTS LOG");
        onCreate(db);
    }

    public boolean insertLOG (String merchantTxnmerchantTxnID,String imei,String payeeVPA ,String payeeVPA ,String amount,String orderNo,String txnAmount,String tranAuthdate,String statusCode,String statusDesc,String responsecode,String approvalCode,String npciTxnmerchantTxnID,String refmerchantTxnID,String logUser,String logTime)
  {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
         contentValues.put(" merchantTxnmerchantTxnID",merchantTxnmerchantTxnID );
         contentValues.put(" imei",imei );
         contentValues.put(" payeeVPA ",payeeVPA );
         contentValues.put(" payeeVPA ",payeeVPA );
         contentValues.put(" amount", amount);
         contentValues.put(" orderNo", orderNo);
         contentValues.put(" txnAmount",txnAmount );
         contentValues.put(" tranAuthdate", tranAuthdate);
         contentValues.put(" statusCode", statusCode);
         contentValues.put(" statusDesc",statusDesc );
         contentValues.put(" responsecode",responsecode );
         contentValues.put(" approvalCode", approvalCode);
         contentValues.put(" npciTxnmerchantTxnID",npciTxnmerchantTxnID );
         contentValues.put(" refmerchantTxnID",refmerchantTxnID );
         contentValues.put(" logUser", logUser);
         contentValues.put(" logTime",logTime );
         db.insert("LOG", null, contentValues);
         return true;
    }

    public Cursor getData(int merchantTxnID) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from LOG where merchantTxnmerchantTxnID="+merchantTxnmerchantTxnID+"", null );
        return res;
    }

    public int numberOfRows(){
        SQLiteDatabase db = this.getReadableDatabase();
        int numRows = (int) DatabaseUtils.queryNumEntries(db, LOG_TABLE_NAME);
        return numRows;
    }

    public boolean updateLOG (String merchantTxnmerchantTxnID,String imei,String payeeVPA ,String payeeVPA ,String amount,String orderNo,String txnAmount,String tranAuthdate,String statusCode,String statusDesc,String responsecode,String approvalCode,String npciTxnmerchantTxnID,String refmerchantTxnID,String logUser,String logTime) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", name);
        contentValues.put("phone", phone);
        contentValues.put("email", email);
        contentValues.put("street", street);
        contentValues.put("place", place);
        db.update("LOG", contentValues, "merchantTxnID = ? ", new String[] { Integer.toString(merchantTxnID) } );
        return true;
    }

    public Integer deleteLOG (Integer merchantTxnID) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete("LOG",
                "merchantTxnID = ? ",
                new String[] { Integer.toString(merchantTxnID) });
    }

    public ArrayList<String> getAllLOG() {
        ArrayList<String> array_list = new ArrayList<String>();

        //hp = new HashMap();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from LOG", null );
        res.moveToFirst();

        while(res.isAfterLast() == false){
            array_list.add(res.getString(res.getColumnIndex(LOG_COLUMN_NAME)));
            res.moveToNext();
        }
        return array_list;
    }
}