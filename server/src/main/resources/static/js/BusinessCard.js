// 명함 등록 팝업 열기
function openRegisterModal() {
    // var registerModal = document.getElementById("registerModal");
    // registerModal.style.display = "block";

    var url = "/businessCard/popup";
    var name = "popup test";
    var option = "width = 500, height = 500, top = 100, left = 200, location = no"
    window.open(url, name, option);
}

// 명함 등록 팝업 닫기
function closeRegisterModal() {
    var registerModal = document.getElementById("registerModal");
    registerModal.style.display = "none";
}

// 키워드 검색
document.addEventListener("DOMContentLoaded", function() {
    document.getElementById("btn_search").addEventListener("click", function() {
        performSearch();
    });
});

function performSearch() {
    var keyword = document.getElementById("keyword").value.toLowerCase();
    var tableRows = document.getElementById("card_list").getElementsByTagName("tr");
    var noResultsMessage = document.getElementById("noResultsMessage");

    var foundResults = false;

    for (var i = 0; i < tableRows.length; i++) {
        var row = tableRows[i];
        var rowData = row.innerText.toLowerCase();

        if (rowData.includes(keyword)) {
            row.style.display = "";
            foundResults = true;
        } else {
            row.style.display = "none";
        }
    }

    noResultsMessage.style.display = foundResults ? "none" : "block";
}