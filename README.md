# A-11_project

--------메인------------------

--------개인페이지------------

--------팀원추가페이지--------

-10.06 해야할일
1. 상단 글씨 수정

2. 
--------DB------------------

   
         // Firebase SDK 라이브러리 가져오기
         import { initializeApp } from "https://www.gstatic.com/firebasejs/9.22.0/firebase-app.js";
         import { getFirestore } from "https://www.gstatic.com/firebasejs/9.22.0/firebase-firestore.js";
         import { collection, addDoc } from "https://www.gstatic.com/firebasejs/9.22.0/firebase-firestore.js";
         import { getDocs } from "https://www.gstatic.com/firebasejs/9.22.0/firebase-firestore.js";


         // Firebase 구성 정보 설정
        // For Firebase JS SDK v7.20.0 and later, measurementId is optional
         const firebaseConfig = {
           apiKey: "AIzaSyAdF8jWGEra_xDoi-aW95H70i4QASE3Mdw",
           authDomain: "a-11-6fc07.firebaseapp.com",
           projectId: "a-11-6fc07",
           storageBucket: "a-11-6fc07.appspot.com",
           messagingSenderId: "643168240333",
           appId: "1:643168240333:web:389cc9758d97e1da20df84",
           measurementId: "G-V7YRN9XPMF"
         };


        // Firebase 인스턴스 초기화
        const app = initializeApp(firebaseConfig);
        const db = getFirestore(app);
