package com.example.drawerlayout_wookie.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ScrollViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ScrollViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("\n[ScrollView기반의 자기소개 내용]"
                + "\n\n\n 한국해양대학교 IT융합 김민욱 \n\n"
                + "\n 해대인 앱개발 총괄: 프로젝트 기획 및 관리 \n"
                + "\n DSC KMOU 활동: Google Developers의 DSC Korea 1기 리드 \n"
                + "\n 해대인싸이트 활동: 제어자동화공학부 학생연구회 설립 및 운영 \n"
                + "\n 아라누리 영자신문사: 한국해양대 교내 영자신문사 기자 \n"
                + "\n LINC+ 수상경력: 영어발표대회 수상 2회, 해커톤 수상 1회, 글로컬 프레젠테이션 수상 1회 \n");
    }

    public LiveData<String> getText() {
        return mText;
    }
}