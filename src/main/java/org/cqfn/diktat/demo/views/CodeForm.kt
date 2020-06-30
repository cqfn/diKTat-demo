package org.cqfn.diktat.demo.views

import org.springframework.web.multipart.MultipartFile

data class CodeForm(var initialCode: String? = null,
                    // do not rename it to isFix or isCheck as it will break thymeleaf as getters are autogenerated
                    var fix: Boolean = false,
                    var check: Boolean = false,
                    var ruleSet:List<String>? = null,
                    // no need to create hashcode/equals for this class. This class is not used in collections.
                    var diktatConfigFile: Array<MultipartFile>? = null,
                    var fixedCode: String? = null,
                    var warnings: List<String>? = null)
