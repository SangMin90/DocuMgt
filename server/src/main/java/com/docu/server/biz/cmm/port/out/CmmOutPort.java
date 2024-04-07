package com.docu.server.biz.cmm.port.out;

import com.docu.server.domain.cmm.*;

import java.util.List;

public interface CmmOutPort {

    List<WordRes> getStdWordList(WordReq req);

    int insertStdWord(WordAddReq req);

    WordDuplicateRes exists(WordDuplicateReq req);
}
