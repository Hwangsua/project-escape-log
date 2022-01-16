package com.recoders.escapelog.dto;

import com.recoders.escapelog.domain.BreakTime;
import com.recoders.escapelog.domain.Recode;
import com.recoders.escapelog.domain.Theme;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Builder
public class RecodeInfoDto {

    private long no;
    private long memberNo;
    private String nickname;
    private String libraryName;
    private String title;
    private String contents;
    private boolean secret;
    private LocalDate regdate;
    private Boolean success;
    private int rating;

    private Integer hint;
    private Integer playerNum;
    private BreakTime breakTime;
    private String nlString;

    private String themeName;
    private String themeShopName;
    private String themeImageUrl;
    private String recodeImageUrl;


}
