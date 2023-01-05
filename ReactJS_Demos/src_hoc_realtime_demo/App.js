
import './App.css';
import HOC from './HOC';

import StockList from './StockList';
import UserList from './UsersList';


  const  StockData = [
    {
        id: 1,
        name: 'TCS'
            
    },
    {
        id: 2,
        name: 'Infosys'
    },
    {
        id: 3,
        name: 'Reliance'
    }
  ]




    const UsersData = [
      {
          id: 1,
          name: 'Krunal'
            
      },
      {
          id: 2,
          name: 'Ankit'
      },
      {
          id: 3,
          name: 'Rushabh'
      }
    ]
  


    const  ProductsData = [
      {
          id: 101,
          name: 'mobile'
              
      },
      {
          id: 102,
          name: 'loptops'
      },
      {
          id: 103,
          name: 'charger'
      }
    ]





  const  Stocks = HOC(StockList,StockData);
  const  Users = HOC(UserList,UsersData);

  const  Products = HOC(StockList,ProductsData);


function App() {
  return (
    <div>
        <Stocks/>
     
       <Products/>

        <Users/>

      </div>
  );
}

//App = HOC(App);

export default App;
