View Pager Project
============================================

Skeleton of view pager implementation for Android projects.

If you want to implement a View Pager in your Android app, follow this skeleton.

*Hope it helps you like it helps me.

Code
--------------------------------------------
Source tree (I have uploaded to the repo only the essential things you need to implement the view pager, they are):

src/
    activities/
        MainActivity

    adapters/
        PagerAdapter : The adapter of the view pager, it builds the fragments (pages).

    fragments/
        MainFragment
        FragmentA : Page A
        FragmentB : Page B
        FragmentC : Page C

res/
    layout/
        activity_main
        fragment_main
        fragment_a : layout for the fragment (page) A
        fragment_b : layout for the fragment (page) B
        fragment_c : layout for the fragment (page) C


How to use
-------------------------------------------

It's easy, if you want to implement a ViewPager in your Android app, you have to do:

    · What number of pages do you want in your ViewPager? Set the PAGES constant in the PagerAdapter to
    the number of pages you want.

        /**
         * Number of fragments (pages of the view pager)
         */
         private static final int PAGES = X;

    · Implement as many FragmentX classes as pages you want (and their corresponding layouts).
    Build an instance of each FragmentX and store it in the PagerAdapter (inside its constructor).


That's all
-------------------------------------------
