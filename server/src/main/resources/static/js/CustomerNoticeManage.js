function openModal() {
  document.getElementById("modal").style.display = "block";
}

function closeModal() {
  document.getElementById("modal").style.display = "none";
}

function confirmModal() {
  // 여기에 확인 버튼 클릭 시 수행할 동작 추가
  console.log("확인 버튼이 클릭되었습니다.");
  closeModal();
}

// 페이지 로드 시 실행
window.onload = function() {
  highlightUrgentNotice();
};

// '긴급' 이라는 문구에만 빨간색으로 표시하는 함수
function highlightUrgentNotice() {
  var rows = document.querySelectorAll("#board tr");
  rows.forEach(function(row) {
    var division = row.cells[1].textContent;
    if (division === '긴급') {
      row.cells[1].style.color = 'red';
    }
  });
}

