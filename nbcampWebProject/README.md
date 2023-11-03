# nbcamp 첫주차 팀 웹 프로젝트!!
A-11_project

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
            apiKey: "AIzaSyD7n4rJxoQvx9ZKH3HYxLkEeroMFydeQP0",
            authDomain: "a-11-2e110.firebaseapp.com",
            projectId: "a-11-2e110",
            storageBucket: "a-11-2e110.appspot.com",
            messagingSenderId: "192520789356",
            appId: "1:192520789356:web:2324b1cdccc9bf383de749",
            measurementId: "G-P93QHPYJC8"
        };


        // Firebase 인스턴스 초기화
        const app = initializeApp(firebaseConfig);
        const db = getFirestore(app);
