
import Home from './Pages/Home.js'
import Destinos from './Pages/Destinos.js';
import Promocoes from './Pages/Promocoes';
import Contato from './Pages/Contato';
import {BrowserRouter, Routes, Route} from 'react-router-dom';

const MainRoutes = () => {



    return(
        <BrowserRouter>
        <Routes>
          <Route path='/' element={<Home/>} />
          <Route path='/destinos' element={<Destinos/>} />
          <Route path='/promocoes' element={<Promocoes/>}/>
          <Route path='/contato' element={<Contato/>} />
        </Routes>
        </BrowserRouter>
    )
}

export default MainRoutes
