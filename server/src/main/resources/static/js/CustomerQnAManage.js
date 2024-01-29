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