package lianxi.bawei.com.myprotwo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowManager;

/**
 * Created by mrzhang on 2016/11/29.
 */

public class MyView extends View {
    int with;
    int height;

    public MyView(Context context) {
        super(context);
        init();
    }


    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        WindowManager wm =(WindowManager) getContext().getSystemService(Context.WINDOW_SERVICE);
        with=wm.getDefaultDisplay().getWidth();
        height=wm.getDefaultDisplay().getHeight();

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint=new Paint();
        paint.setColor(Color.BLUE);
        paint.setAntiAlias(true);
        canvas.drawCircle(with / 2, height / 2, with / 2, paint);
    }
}
