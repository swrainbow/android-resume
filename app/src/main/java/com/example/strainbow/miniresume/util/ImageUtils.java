package com.example.strainbow.miniresume.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.widget.ImageView;

import java.io.IOException;

/**
 * Created by strainbow on 2018/3/19.
 */

public class ImageUtils {
    public static void loadImage(Context context, Uri uri, ImageView imageView){
        try{
            Bitmap bitmap = MediaStore.Images.Media.getBitmap(context.getContentResolver(),uri);
            imageView.setImageBitmap(bitmap);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
