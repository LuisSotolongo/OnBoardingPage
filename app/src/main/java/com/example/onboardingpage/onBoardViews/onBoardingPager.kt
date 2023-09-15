package com.example.onboardingpage.onBoardViews

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScopeInstance.align
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.onboardingpage.data.PageData
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.PagerState

@OptIn(ExperimentalPagerApi::class)
@Composable
fun OnBoardingPager(
    item: List<PageData>,
    pagerState: PagerState,
    modifier: Modifier = Modifier
    ){
    Box (modifier = Modifier){
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            HorizontalPager(state = pagerState) {
                //centro de todo
                
            }
            PagerIndicator(size = item.size, currentPage = pagerState.currentPage )
        }
        Box(modifier = Modifier.align(Alignment.BottomCenter)){
            ButtonFinish(currentPage = pagerState.currentPage)
        }
    }
    
}