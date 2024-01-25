// 사용자 등록 팝업 열기
function openRegisterModal() {
    var registerModal = document.getElementById("registerModal");
    registerModal.style.display = "block";
}

// 사용자 등록 팝업 닫기
function closeRegisterModal() {
    var registerModal = document.getElementById("registerModal");
    registerModal.style.display = "none";
}

// 사용자 등록 함수
function registerUser() {
    
    var username = document.getElementById("username").value;
    var email = document.getElementById("emailId").value + "@" + document.getElementById("emailDomainSelect").value;
    var contact = document.getElementById("contact").value;
    var userRole = document.getElementById("userRole").value;

    // 등록 후 팝업 닫기
    closeRegisterModal();
}
