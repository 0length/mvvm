package ga.bolehju.mvvm.viewModel

import android.arch.lifecycle.ViewModel


class MainActivityViewModle : ViewModel(){

 fun additionalFunction(value1 : String, value2 : String): String {
     return (value1.toInt() + value2.toInt()).toString()
}

}