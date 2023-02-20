





function signup(){

    let formData = new FormData(document.querySelector("#signupForm"));
    

     $.ajax({
        type: "POST",
        url: "/member/setmember",
        contentType:false,
        processData: false,
        data:formData ,
        success:function(data){
            if(data!=0){
                alert("회원가입이 완료되었습니다.")
                location.href= "/member/login";

            }else{alert("회원가입 실패")}
            
        },
        error: function (e) {
            
            console.log("ERROR : ", e);
        }



    }); 





}