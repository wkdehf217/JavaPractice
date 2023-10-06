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
            apiKey: "AIzaSyDmOmAHF0tTxLNxs5iQAUO8FGXdOSifkKk",
            authDomain: "sparta-42331.firebaseapp.com",
            projectId: "sparta-42331",
            storageBucket: "sparta-42331.appspot.com",
            messagingSenderId: "756996925390",
            appId: "1:756996925390:web:09ca83e26e825bb145ad9f",
            measurementId: "G-SVCK5M1B5R"
        };


        // Firebase 인스턴스 초기화
        const app = initializeApp(firebaseConfig);
        const db = getFirestore(app);
