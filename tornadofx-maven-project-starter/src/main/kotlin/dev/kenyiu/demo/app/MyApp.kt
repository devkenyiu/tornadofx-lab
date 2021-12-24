package dev.kenyiu.demo.app

import dev.kenyiu.demo.view.MainView
import javafx.stage.Stage
import tornadofx.App

class MyApp: App(MainView::class, Styles::class) {
    override fun start(stage: Stage) {
        with(stage) {
            width = 400.0
            height = 150.0
        }
        super.start(stage)
    }
}