package com.example.test;

import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import com.example.test_key_storage.R;
import net.sf.andpdf.pdfviewer.PdfViewerActivity;

import java.io.File;

public class MyPDFActivity extends PdfViewerActivity {

    public static void startMyPDFActivity(Context context) {
        String externalStorageDirectory = Environment.getExternalStorageDirectory().getAbsolutePath();
        File pdfFile = new File(externalStorageDirectory, "/test.pdf");
        Intent intent = new Intent(context, MyPDFActivity.class);
        intent.putExtra(PdfViewerActivity.EXTRA_PDFFILENAME, pdfFile.getAbsolutePath());
        context.startActivity(intent);
    }

    @Override
    public int getPreviousPageImageResource() {
        return R.drawable.left_arrow;
    }

    @Override
    public int getNextPageImageResource() {
        return R.drawable.right_arrow;
    }

    @Override
    public int getZoomInImageResource() {
        return R.drawable.zoom_in;
    }

    @Override
    public int getZoomOutImageResource() {
        return R.drawable.zoom_out;
    }

    @Override
    public int getPdfPasswordLayoutResource() {
        return R.layout.pdf_file_password;
    }

    @Override
    public int getPdfPageNumberResource() {
        return R.layout.dialog_pagenumber;
    }

    @Override
    public int getPdfPasswordEditField() {
        return R.id.etPassword;
    }

    @Override
    public int getPdfPasswordOkButton() {
        return R.id.btOK;
    }

    @Override
    public int getPdfPasswordExitButton() {
        return R.id.btExit;
    }

    @Override
    public int getPdfPageNumberEditField() {
        return R.id.pagenum_edit;
    }
}