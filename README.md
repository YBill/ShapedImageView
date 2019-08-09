## ShapedImageView 图片圆形圆角描边

ShapedImageView 的使用方法：

##### 在布局文件中使用 ShapedImageView

```
        <com.bill.shapeimageview.ShapedImageView
            android:layout_width="match_parent"
            android:layout_height="200dp"
            android:layout_margin="10dp"
            android:scaleType="centerCrop"
            android:src="@mipmap/image"
            app:img_border_color="#ff0000"
            app:img_border_width="1dp"
            app:round_radius="5dp"
            app:shape_mode="round_rect" />
```

##### 下面是 ShapedImageView 的属性

**shape_mode **

设置图片的显示模式，有三个值：

- none 不处理图片，默认模式

- round_rect 图片设置圆角

- circle 图片设置为圆形

  

**round_radius**

设置图片的圆角半径（4个角），shape_mode="round_rect" 时有效，默认 0



**round_radius_left_top**

**round_radius_right_top**

**round_radius_left_bottom**

**round_radius_right_bottom**

设置图片的圆角半径，分别是左上角、右上角、左下角、右下角，shape_mode="round_rect" 时有效，round_radius 优先级高



**img_border_width**

设置图片描边宽度，默认 0f



**img_border_color**

设置图片描边颜色，img_border_width 大于0 时生效，默认 #ffffff
