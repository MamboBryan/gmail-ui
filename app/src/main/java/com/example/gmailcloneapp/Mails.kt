package com.example.gmailcloneapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.gmailcloneapp.databinding.FragmentMailsBinding


class MailsFragment : Fragment() {
    private  var _binding : FragmentMailsBinding? = null
    private val binding get() = _binding!!
    private val mailsAdapter = MailsAdapter ()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply{
            recyclerView.adapter = mailsAdapter
        }
        mailsAdapter.submitList(listOf(
            MailsItem(imageResource = R.drawable.ic_baseline_mail_24, text1 = "mails 1"),
            MailsItem(imageResource = R.drawable.ic_baseline_mail_24, text1 = "mails 2"),
            MailsItem(imageResource = R.drawable.ic_baseline_mail_24, text1 = "mails 3"),
            MailsItem(imageResource = R.drawable.ic_baseline_mail_24, text1 = "mails 4"),
            MailsItem(imageResource = R.drawable.ic_baseline_mail_24, text1 = "mails 5"),
            MailsItem(imageResource = R.drawable.ic_baseline_mail_24, text1 = "mails 6"),
            MailsItem(imageResource = R.drawable.ic_baseline_mail_24, text1 = "mails 7"),
            MailsItem(imageResource = R.drawable.ic_baseline_mail_24, text1 = "mails 8"),
            MailsItem(imageResource = R.drawable.ic_baseline_mail_24, text1 = "mails 9"),
            MailsItem(imageResource = R.drawable.ic_baseline_mail_24, text1 = "mails 10"),
            MailsItem(imageResource = R.drawable.ic_baseline_mail_24, text1 = "mails 11"),
            MailsItem(imageResource = R.drawable.ic_baseline_mail_24, text1 = "mails 12"),
            MailsItem(imageResource = R.drawable.ic_baseline_mail_24, text1 = "mails 13"),
            MailsItem(imageResource = R.drawable.ic_baseline_mail_24, text1 = "mails 14"),
            MailsItem(imageResource = R.drawable.ic_baseline_mail_24, text1 = "mails 15"),
            MailsItem(imageResource = R.drawable.ic_baseline_mail_24, text1 = "mails 16"),
            MailsItem(imageResource = R.drawable.ic_baseline_mail_24, text1 = "mails 17"),
            MailsItem(imageResource = R.drawable.ic_baseline_mail_24, text1 = "mails 18"),
            MailsItem(imageResource = R.drawable.ic_baseline_mail_24, text1 = "mails 19"),
            MailsItem(imageResource = R.drawable.ic_baseline_mail_24, text1 = "mails 20"),
            MailsItem(imageResource = R.drawable.ic_baseline_mail_24, text1 = "mails 21"),
            MailsItem(imageResource = R.drawable.ic_baseline_mail_24, text1 = "mails 22"),
            MailsItem(imageResource = R.drawable.ic_baseline_mail_24, text1 = "mails 23"),
        ))
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        _binding = FragmentMailsBinding.inflate(inflater, container, false)
        return binding.root
    }

}