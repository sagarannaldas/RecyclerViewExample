package in.techrebounce.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import in.techrebounce.recyclerviewexample.Adapters.RecyclerViewAdapter;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> mImages = new ArrayList<>();
    private ArrayList<String> mImageNames = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initBitmaps();
        initRecyclerView();
    }

    private void initBitmaps(){

        // add data to arraylists

        mImages.add("https://image.cnbcfm.com/api/v1/image/105377973-1533563328906rtx5qks4.jpg?v=1582149229");
        mImages.add("https://static-27.sinclairstoryline.com/resources/media/e2ce44b6-28b0-45bc-916d-5aa927d18294-large16x9_200624_ap_lori_vallow.jpg?1608089244492");
        mImages.add("https://s.hdnux.com/photos/01/13/75/36/19912634/3/rawImage.jpg");
        mImages.add("https://www.gannett-cdn.com/presto/2020/12/15/USAT/18a4fc3b-1582-4596-add1-2f6e6990cd10-John_Tyreman_and_family_.jpg?crop=5243,2950,x0,y391&width=3200&height=1680&fit=bounds");
        mImages.add("https://i.ytimg.com/vi/VLPDNo8PjIE/maxresdefault.jpg");
        mImages.add("https://www.clickondetroit.com/resizer/mzHNWt5OwgelMoLFwsKSKJsB2ZA=/1600x900/smart/filters:format(jpeg):strip_exif(true):strip_icc(true):no_upscale(true):quality(65)/cloudfront-us-east-1.images.arcpublishing.com/gmg/KUFN33WMSFE7PAN4MO5LCYP3K4.jpg");
        mImages.add("https://a57.foxnews.com/static.foxbusiness.com/foxbusiness.com/content/uploads/2020/12/0/0/Mark-Zuckerberg-and-Priscilla-Chan.jpg?ve=1&tl=1");
        mImages.add("https://img.ksl.com/slc/2803/280399/28039930.jpeg?filter=ksl/responsive_story_lg");
        mImages.add("https://a57.foxnews.com/static.foxbusiness.com/foxbusiness.com/content/uploads/2020/07/0/0/Alex-Rodriguez-2-Getty-Images.jpg?ve=1&tl=1");
        mImages.add("https://www.wlbt.com/resizer/VucCNRrpsWrKO-B4odAHBjzAsl4=/1200x0/cloudfront-us-east-1.images.arcpublishing.com/raycom/MT4Z5AGOGJGZ7HUUP4SVEQNNII.jpg");
        mImages.add("https://www.countynewscenter.com/wp-content/uploads/coronavirus-1600px.jpg");
        mImages.add("https://www.denverpost.com/wp-content/uploads/2020/12/AFP_8X8824.jpg?w=1024&h=765");
        mImages.add("https://d32r1sh890xpii.cloudfront.net/article/718x300/2020-12-15_j0nq9voimc.jpg");
        mImages.add("https://www.kold.com/resizer/lWPeFyDD47zrJ_aFPHDH7TfTjIk=/1200x0/cloudfront-us-east-1.images.arcpublishing.com/raycom/VHFYR5HBDZBZZNAWGF2RO5ZV6I.PNG");

        mImageNames.add("1");
        mImageNames.add("2");
        mImageNames.add("3");
        mImageNames.add("4");
        mImageNames.add("5");
        mImageNames.add("6");
        mImageNames.add("7");
        mImageNames.add("8");
        mImageNames.add("9");
        mImageNames.add("10");
        mImageNames.add("11");
        mImageNames.add("12");
        mImageNames.add("13");
        mImageNames.add("14");


    }

    private void initRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(mImageNames, mImages,this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}