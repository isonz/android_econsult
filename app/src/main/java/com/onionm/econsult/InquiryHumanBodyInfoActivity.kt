package com.onionm.econsult

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.view.menu.MenuBuilder
import android.view.Menu
import android.widget.SimpleAdapter
import kotlinx.android.synthetic.main.inquiry_human_body_info.gridview


class InquiryHumanBodyInfoActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.inquiry_human_body_info)

        val from:Array<String> = arrayOf("img", "text")
        val to:IntArray = intArrayOf(R.id.human_body_list_img, R.id.human_body_list_text)

        var data = intent.getStringExtra("body")
        if (null == data) data = "head"

        var dataList = ArrayList<Map<String, Any>>()
        var flag = 0
        when (data) {
            "head" -> {
                val icon:IntArray = intArrayOf(
                        R.drawable.body_head_ear,
                        R.drawable.body_head_eye,
                        R.drawable.body_head_head,
                        R.drawable.body_head_mouth,
                        R.drawable.body_head_nose
                )
                val name:Array<String> = arrayOf(
                        "耳朵",
                        "眼睛",
                        "头",
                        "嘴巴",
                        "鼻子"
                )
                val code:Array<String> = arrayOf(
                        "head_ear",
                        "head_eye",
                        "head_head",
                        "head_mouth",
                        "head_nose"
                )
                dataList = initData(icon, name, code, data)
                flag = 1
            }
            ("body_1") -> {
                val icon:IntArray = intArrayOf(
                        R.drawable.body_1_chest,
                        R.drawable.body_1_heart,
                        R.drawable.body_1_lung,
                        R.drawable.body_1_stomach
                )
                val name:Array<String> = arrayOf(
                        "乳房",
                        "心脏",
                        "肺",
                        "胃"
                )
                val code:Array<String> = arrayOf(
                        "body_1_chest",
                        "body_1_heart",
                        "body_1_lung",
                        "body_1_stomach"
                )
                dataList = initData(icon, name, code, data)
                flag = 2
            }
            ("body_2") -> {
                val icon:IntArray = intArrayOf(
                        R.drawable.body_2_bladder,
                        R.drawable.body_2_intestline,
                        R.drawable.body_2_kednuy,
                        R.drawable.body_2_liver,
                        R.drawable.body_2_pancreas,
                        R.drawable.body_2_prostate,
                        R.drawable.body_2_reproductive_system
                )
                val name:Array<String> = arrayOf(
                        "膀胱",
                        "肠道",
                        "肾脏",
                        "肝脏",
                        "胰腺",
                        "前列腺",
                        "生殖系统"
                )
                val code:Array<String> = arrayOf(
                        "body_2_bladder",
                        "body_2_intestline",
                        "body_2_kednuy",
                        "body_2_liver",
                        "body_2_pancreas",
                        "body_2_prostate",
                        "body_2_reproductive_system"
                )
                dataList = initData(icon, name, code, data)
                flag = 3
            }
            else -> {
                val icon:IntArray = intArrayOf(
                        R.drawable.body_leg_bones,
                        R.drawable.body_leg_skin
                )
                val name:Array<String> = arrayOf(
                        "骨/椎骨",
                        "皮肤"
                )
                val code:Array<String> = arrayOf(
                        "body_leg_bones",
                        "body_leg_skin"
                )
                dataList = initData(icon, name, code, data)
            }
        }

        val adapter = SimpleAdapter(this, dataList, R.layout.gridview_item, from, to)
        gridview.adapter = adapter
        gridview.setOnItemClickListener { parent, view, position, id ->
            intent = Intent(InquiryHumanBodyInfoActivity@this, InquiryNowActivity::class.java)
            intent.putExtra("partCode", dataList[position]["code"].toString())
            intent.putExtra("body", dataList[position]["body"].toString())
            startActivity(intent)
        }

    }


    fun initData(icon:IntArray, name:Array<String>, code:Array<String>, body:String): ArrayList<Map<String, Any>> {
        val dataList = ArrayList<Map<String, Any>>()
        for (i in 0 until icon.size) {
            val map = HashMap<String, Any>()
            map["img"] = icon[i]
            map["text"] = name[i]
            map["code"] = code[i]
            map["body"] = body
            dataList.add(map)
        }
        return dataList
    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menu?.let {
            if (menu is MenuBuilder) {
                try {
                    val field = menu.javaClass.getDeclaredField("mOptionalIconsVisible")
                    field.isAccessible = true
                    field.setBoolean(menu, true)
                } catch (ignored: Exception) {
                    // ignored exception
                }
            }
        }
        val inflater = menuInflater
        inflater.inflate(R.menu.actionbar_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }


}
