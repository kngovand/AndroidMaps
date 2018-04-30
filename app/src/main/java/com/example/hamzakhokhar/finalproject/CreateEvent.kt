package com.example.hamzakhokhar.finalproject

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import kotlinx.android.synthetic.main.create_event.*

/**
 * Created by hamzakhokhar on 4/25/18.
 */class CreateEvent: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.create_event)

        val event = EventActivity()

        edittext_name.onChange {
            event.name = it
        }
        edittext_type.onChange{
            event.type = it
        }
        edittext_startdate.onChange{
            event.startdate = it
        }
        edittext_enddate.onChange{
            event.enddate = it
        }
        edittext_starttime.onChange{
            event.starttime = it
        }
        edittext_endtime.onChange{
            event.endtime = it
        }
        edittext_address.onChange{
            event.address = it
        }
        edittext_state.onChange{
            event.state = it
        }
        edittext_city.onChange{
            event.city = it
        }
        edittext_zip.onChange{
            event.zip = it
        }

        button_save.setOnClickListener {
            EventService.save(event);
        }

    }
}

fun EditText.onChange(cb: (String) -> Unit) {
    this.addTextChangedListener(object: TextWatcher {
        override fun afterTextChanged(s: Editable?) { cb(s.toString()) }
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
    })
}