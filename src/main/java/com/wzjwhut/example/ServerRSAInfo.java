package com.wzjwhut.example;

import com.wzjwhut.util.HexUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigInteger;
import java.util.Base64;

/** 帮助分析抓包到的数据, 使用已知的证书/公钥/私钥 来分析握手过程
 *  私钥和公钥. 格式
 *  https://blog.csdn.net/wzj_whut/article/details/86477568
 * */
public class ServerRSAInfo {
    private final static Logger logger = LogManager.getLogger(ServerRSAInfo.class);
    public static BigInteger n;
    public static BigInteger e; /** 公钥 */
    public static BigInteger d; /** 私钥 */

    static {
        String key = "MIIFDjBABgkqhkiG9w0BBQ0wMzAbBgkqhkiG9w0BBQwwDgQIff/B18M9S1UCAggA" +
                "MBQGCCqGSIb3DQMHBAjWzSQ2EWm5dgSCBMhhZd6XfsW6Rcbwn0/V5NhSUQ/UoQ6n" +
                "y7nE8ozDlWlWb2at6eXCfjsVkWHxkeCEI09qEmfEAt1u+qgwtRBYfkcaWDUgbmR5" +
                "13lGezZwHXbi0iIQetkgS/zcAOdeRuGQancdBOW1Z58OOpyriWVM2fZRUm1UyIj/" +
                "n3CJfhAZf/ClZ5xNEI6SUStw3goru4kfZ1c7fyrqorL9QKEUlgmfZ87YgyHFcJ/A" +
                "S7bKadWZA9BeknDottOcHmhKECWrd+oe4hgq8czZfwsFq6Fgdg1qwbhSUqObekhW" +
                "/aJ+lPAXR6k5kXYX1idEMuGDjrLxnJqit4C8a4K40OgagV6ph10Bn53tQFXV+L+q" +
                "gpyRdUPCXMxijTzEIdZj6dktymu8MlDODIC6BQ+jc/M5TrH/TyP/JJlAIPfO42In" +
                "ptIJrIZ5g+PYUvGgf2jYqaeN3ZKfOFgLCJRnyMZIv5EaNUGm4TdbyQiOSYprJu1u" +
                "NTjON7AM6zAmiHyI1096mDmjE7C9560Eza756B43hDnGzNH4O9MGpLDYE7q6YS7f" +
                "HaP2rjY1FWwHfh8nPDMQfw6AP7jH1vwEKJPnDpIYkX5T5GHVe7wPw6EUEglGrehN" +
                "5EZzqDuQsL+l8p51Lpi7Dcm1PWWmz3CAFrkqk8Y2oLLE2yoVCTYPiye02yPrCEuj" +
                "qtW8QA5/08T43dHON3f1mCmhL60JSIie1QFiGSq5JAHA1zpEOR2GZbTbgr1quNad" +
                "1twTw0AMXdHUOoku4VWv4eNIgXep2W7lxdueWjOBTbsDI2oYbYKnGElpUWuDhF4E" +
                "pFuJmj72Xczfsp4MKoLiAjgeOMREy7F5XRpoTKB9yRgU0iaDFTS9JkzPhjm+dbsd" +
                "GxtaqxDhe4MTVMQsdhjxo8P5+dvU4G0F0rHu0wnVnXbyB3x5EDoEu1l/yPD5Q56t" +
                "IwscRggVyZLxu+PlrKWp7y7HkITfPXFNCJb5m6JZZ+1ZYbjvZEzI5Mc5IEpU9/lg" +
                "dvFPClYCVxX425jKNsr1pKQFrcn8Byyij0d5SIA6J+H/Z67IQnfnHnqLR/zaRkgp" +
                "yYJMPNKVma/vwinbRx/CTXi9s9UBJmOu1l2lppHnkH2gs33yk0p4CjHJEQkmp1kJ" +
                "Qdd2Gbb7tP2HiPSx9nOcBBpMbhlK607QYfXmfmlRlGJpanixk7eoYLXnxF3PCwxw" +
                "7q5cOq5LuayMuq2xeRplp7TZR8jnup0AlUbxl0q8AkjIwBjL5aZctFh9fhckt8RJ" +
                "ldsKxN45kb/+dcx16XgQq0fou25ZJMWVoIoiLdSp33Q9GmaA73lZl9LQ/VlwfFX+" +
                "3Npna1k95zJ9SM8l6rDJr5XsHTVFt8ixjr2OfoZ5t3aTbBfKxToqczGUHzBhW6Fj" +
                "YHU+6N/RVGHLT6gH8G2EPnSgh+t05pI30uFZPB3/SqlDmQ6y2tFTpYISkWKv0CKd" +
                "hf46zUYsR+zr5jRSYN/gOvxau9cxvaRkvMxE1S8+qRSPtAGCz4t8foIEWansI8wJ" +
                "Tm7g/iVkn2F8zmXpJVtqB+ACz/jvcRS6yncMAWQ7+KMAG8f4kuV0x0WW/0TPyeDb" +
                "HfCzq5Bs1VcqTljreEzVQtGgu3XnhL4wITZ3iWh4rvhgVL+XeyR1na1gVn60ESKz" +
                "Z9E=";
        logger.info("server private key: \r\n{}", HexUtils.dumpString(Base64.getDecoder().decode(key), 16));
    }

}