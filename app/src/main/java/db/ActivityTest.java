package db;

/**
 * Created by wangxi on 06/03/2017.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class ActivityTest {
    @Rule
    public ActivityTestRule mActivityRule = new ActivityTestRule<>(
            FeedReaderContract.class);

    @Test
    public void sayHello(){
        onView(withText("Say hello!")).perform(click());

        onView(withId(R.id.textView)).check(matches(withText("Hello, World!")));
    }
}
