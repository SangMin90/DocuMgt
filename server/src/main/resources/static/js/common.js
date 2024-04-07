function c_confirmAlert(notiTxt){
    return swal({
        title: '확인',
        text: notiTxt,
        icon: 'info',
        buttons: {
            confirm: {
                text: 'Confirm',
                value: true,
                visible: true,
                className: 'btn btn-info',
                closeModal: true
            },
            cancel: {
                text: 'Cancel',
                value: null,
                visible: true,
                className: 'btn btn-default',
                closeModal: true
            }
        }
    })
}

function c_notiAlert(txt){
    return swal({
        title: '알림',
        text: txt,
        icon: 'success',
        buttons: {
            confirm: {
                text: 'Confirm',
                value: true,
                visible: true,
                className: 'btn btn-success',
                closeModal: true
            }
        }
    })
}

function c_showErrorAlert(e) {
    if(e.status == 401) e.responseText = "권한 없음 오류입니다. (로그인 유효시간 초과 또는 접근불가 메뉴)";
    swal({
        title: e.status + " ERROR",
        icon: 'warning',
        text: e.responseText ? e.responseText : "",
        buttons: {
            confirm: {
                text: 'Confirm',
                value: true,
                visible: true,
                className: 'btn btn-warning',
                closeModal: true
            }
        }
    }).then(function(result){
        if (e.status == 401 || e.status == 403) {
            location.href = '/login';
        }
    });
}

// ajax
$(document).ajaxSuccess(function(event, xhr, settings) {
    let statusCode = xhr.responseJSON.statusCode;
    if( statusCode != 200 && ( statusCode > 30000  && statusCode < 40000) ) {
         alert(xhr.responseJSON.detailMessage);
         location.href="/login";
         return false;
    }
});

// 처음버튼
function firstPage() {
        // 1페이지, 페이징 최대 10개
        formSearh(1);
}

// 이전버튼
function prevPage(curPage) {
    var curPage = Number(curPage);
    if(curPage > 1) {
        // 1페이지, 페이징 최대 10개
        formSearh(curPage - 1);
    }
}
// 이후버튼
function nextPage(curPage, endPage) {
    var curPage = Number(curPage);
    var endPage = Number(endPage);
    if(endPage > curPage) {
        // 1페이지, 페이징 최대 10개
        formSearh(curPage + 1);
    }
}
//마지막페이지
function lastPage(endPage) {
     var endPage = Number(endPage);
     formSearh(endPage);
}

//에디터 생성
function tostEditor(addr) {
    
    if(!Boolean(document.querySelector('.toastui-editor'))) {
        return false;
    }
    
    // 에디터
    editor = new toastui.Editor({
        el: document.querySelector('.toastui-editor'),
        previewHighlight: false,
        initialEditType: 'wysiwyg',
        height: '300px',
        oolbarItems: ['imageResize'],
        hooks: {
            addImageBlobHook: (blob, callback) => {
                const formData = new FormData();
                formData.append('image', blob);
                formData.append('addr', addr);

                $.ajax({
                    type: 'PUT',
                    enctype: 'multipart/form-data',
                    url: '/api/v1/customer/image/upload',
                    data: formData,
                    dataType: 'json',
                    processData: false,
                    contentType: false,
                    cache: false,
                    timeout: 600000,
                    success: function (data) {
                        var datas = data.data;
                        let url;

                        for (var i = 0; i < datas.length; i++) {
                            imgFilesArr.push(datas[i].filePathNm + '-' + datas[i].atchFileNm + '-' + datas[i].fileExtnNm + '-' + datas[i].atchFileSz + '-' + datas[i].orgnlAtchFileNm)
                            url = datas[i].filePathNm + datas[i].atchFileNm;

                        }
                        // callback : 에디터(마크다운 편집기)에 표시할 텍스트, 뷰어에는 imageUrl 주소에 저장된 사진으로 나옴
                        // 형식 : ![대체 텍스트](주소)
                        callback('https://kr1-api-object-storage.nhncloudservice.com/v1/AUTH_9c6eacbf7cf24d05ae625145cdc3b0f9' + url, '');
                    },
                    error: function (e) {
                        //console.log(e.abort([statusText]));
                        callback('', '이미지 업로드 실패');
                    }
                });

            }
        }
    });
}

//ekko-lightbox
$(function () {
    $(document).on('click', '[data-toggle="lightbox"]', function(event) {
        event.preventDefault();
        $(this).ekkoLightbox({
            alwaysShowClose: true
        });
    });
    
    if(Boolean(document.querySelector('.filter-container'))) {
        $('.filter-container').filterizr({gutterPixels: 3});
    }
    $('.btn[data-filter]').on('click', function() {
    $('.btn[data-filter]').removeClass('active');
        $(this).addClass('active');
    });
})

