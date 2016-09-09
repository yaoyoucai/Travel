package shbd.travel.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;

import shbd.travel.activity.R;
import shbd.travel.utils.SizeUtils;
import shbd.travel.utils.UIUtils;

/**
 * 项目名称：Travel
 * 类描述：
 * 创建人：yh
 * 创建时间：2016/9/9 14:22
 * 修改人：yh
 * 修改时间：2016/9/9 14:22
 * 修改备注：
 */
public class CircleImageViewWithText extends LinearLayout {
    private SimpleDraweeView mCircleImageView;
    private TextView mTextView;
    private int mImageWidth;
    private int mImageHeight;
    private Drawable mImageSrc;
    private float mTextSize;
    private int mTextColor;
    private String mTextContent;

    public CircleImageViewWithText(Context context) {
        this(context, null);
    }

    public CircleImageViewWithText(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CircleImageViewWithText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.CircleImageViewWithText, defStyleAttr, 0);
        mImageWidth = (int) ta.getDimension(R.styleable.CircleImageViewWithText_imagewidth, SizeUtils.px2dp(context, 80));
        mImageHeight = (int) ta.getDimension(R.styleable.CircleImageViewWithText_imageheight, SizeUtils.px2dp(context, 80));
        mImageSrc = ta.getDrawable(R.styleable.CircleImageViewWithText_imagesrc);
        mTextSize = ta.getDimension(R.styleable.CircleImageViewWithText_textsize, SizeUtils.px2sp(context, 20));
        mTextColor = ta.getColor(R.styleable.CircleImageViewWithText_textcolor, UIUtils.getColor(R.color.colorAccent));
        mTextContent = ta.getString(R.styleable.CircleImageViewWithText_textcontent);
        ta.recycle();
        initView(context);
    }

    private void initView(Context context) {
        mCircleImageView = new SimpleDraweeView(context);
        GenericDraweeHierarchy hierarchy = mCircleImageView.getHierarchy();
        hierarchy.setPlaceholderImage(mImageSrc);
        hierarchy.setActualImageScaleType(ScalingUtils.ScaleType.CENTER_CROP);
        RoundingParams roundingParams = RoundingParams.fromCornersRadius(5f);
        roundingParams.setRoundAsCircle(true);
        hierarchy.setRoundingParams(roundingParams);

        mTextView = new TextView(context);
        mTextView.setText(mTextContent);
        mTextView.setTextColor(mTextColor);
        mTextView.setGravity(Gravity.CENTER);
        addView(mCircleImageView, mImageWidth, mImageHeight);
        addView(mTextView);
    }


}
