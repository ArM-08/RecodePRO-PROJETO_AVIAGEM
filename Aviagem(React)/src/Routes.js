
import Home from './Pages/Home.js'
import Destinos from './Pages/Destinos.js';
import Promocoes from './Pages/Promocoes';
import Contato from './Pages/Contato';
import {BrowserRouter, Routes, Route} from 'react-router-dom';
import Admin from './Pages/Admin.js';
import Cadastro from './Pages/Cadastro.js';

const MainRoutes = () => {



    return(
        <BrowserRouter>
        
        <Routes>
          <Route path='/' element={<Home/>} />
          <Route path='/destinos' element={<Destinos/>} />
          <Route path='/promocoes' element={<Promocoes/>}/>
          <Route path='/contato' element={<Contato/>} />
          <Route path='/admin' element={<Admin/>} />
          <Route path='/cadastro' element={<Cadastro/>} />
        </Routes>
        
        </BrowserRouter>
    )
}

export default MainRoutes
