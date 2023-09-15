@file:OptIn(ExperimentalFoundationApi::class)

package com.example.onboardingpage.onBoardViews

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.onboardingpage.R
import com.example.onboardingpage.data.PageData
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.rememberPagerState

@OptIn(ExperimentalFoundationApi::class, ExperimentalPagerApi::class)
@Composable
fun MainOnBoarding() {
    val items = ArrayList<PageData>()

    items.add(
        PageData(
            R.raw.page1,
            "Title 1",
            "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod"
        )
    )
    items.add(
        PageData(
            R.raw.page2,
            "Title 2",
            "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod"
        )
    )
    items.add(
        PageData(
            R.raw.page3,
            "Title 3",
            "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod"
        )
    )

    val pagerState = rememberPagerState(
        pageCount = items.size,
        initialOffscreenLimit = 2,
        infiniteLoop = false,
        initialPage = 0
    )
    OnBoardingPager(
        item = items,
        pagerState = pagerState,
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
    )
}