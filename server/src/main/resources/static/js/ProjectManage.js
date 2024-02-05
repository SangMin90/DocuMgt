// 검색 기능 구현 (JavaScript)
function searchProjects() {
    var searchType = document.getElementById("search-type").value;
    var keyword = document.getElementById("search-keyword").value;

    // 검색 로직을 구현하여 프로젝트 목록을 필터링하고 업데이트
    // (여기에 구현해야 함)
}

// 프로젝트 등록 팝업 열기
function openProjectForm() {
    document.getElementById("popup-container").style.display = "flex";
}

// 프로젝트 등록 팝업 닫기
function closeProjectForm() {
    document.getElementById("popup-container").style.display = "none";
}

// 프로젝트 등록 기능 구현 (JavaScript)
function saveProject() {
    var projectName = document.getElementById("project-name").value;
    var projectType = document.getElementById("project-type").value;
    var client = document.getElementById("client").value;
    var clientContact = document.getElementById("client-contact").value;
    var projectManager = document.getElementById("project-manager").value;
    var projectStartDate = document.getElementById("project-start-date").value;
    var projectEndDate = document.getElementById("project-end-date").value;

    // 저장 로직을 구현하여 프로젝트 목록에 새로운 프로젝트 추가
    // (여기에 구현해야 함)

    // 팝업 닫기
    closeProjectForm();
}
