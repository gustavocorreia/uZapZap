package br.com.gcs.uzapzap.ui.status

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import br.com.gcs.uzapzap.R
import br.com.gcs.uzapzap.ui.base.BaseFragment


class StatusFragment : BaseFragment() {

    override fun getTitulo():Int{
        return R.string.tab_status
    }

    // TODO: Rename and change types of parameters
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_status, container, false)
    }
}
