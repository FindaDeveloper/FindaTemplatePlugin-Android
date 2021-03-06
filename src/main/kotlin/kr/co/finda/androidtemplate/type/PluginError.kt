package kr.co.finda.androidtemplate.type

enum class PluginError(
    val title: String,
    val message: String
) {

    /**
     * Finda Template
     */
    FT101("선택된 위치를 찾을 수 없습니다", "FT101"),
    FT102("유효하지 않은 경로입니다", "FT102-'src/main/(java|kotlin)'경로에 해당하지 않습니다"),
    FT103("중복된 이름이 존재합니다", "FT103-이미 생성된 Activity 혹은 ViewModel을 확인해주세요"),
    FT104("레이아웃 폴더를 찾을 수 없습니다", "FT104-레이아웃 파일이 생성되지 못했습니다"),

    /**
     * ViewModel Test Template
     */
    VTT101("선택된 위치를 찾을 수 없습니다", "VTT101"),
    VTT102("유효하지 않은 경로입니다", "VTT102-'src/main/(java|kotlin)/test' 경로에 해당하지 않습니다"),
    VTT103("중복된 이름이 존재합니다", "VTT103-이미 생성된 테스트 파일을 확인해주세요"),
}