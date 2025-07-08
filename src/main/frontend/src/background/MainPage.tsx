import React, { useEffect, useState } from 'react';

const MainPage = () => {
  const [stock, setStock] = useState(null);
  const symbol = 'SBIN';

  const fetchStockData = async () => {
    try {
      const response = await fetch(`http://localhost:8080/api/stocks/${symbol}`);
      const data = await response.json();
      setStock(data);
    } catch (error) {
      console.error('Error fetching stock data:', error);
      setStock(null);
    }
  };

  useEffect(() => {
    fetchStockData();
    const interval = setInterval(fetchStockData, 5000);
    return () => clearInterval(interval);
  }, []);

  return (
    <div className='min-h-[92vh] bg-gray-50 px-6 py-10' data-theme='aqua'>
      <h1 className='text-3xl font-bold text-gray-800 mb-8'>SBI Live Stock Data</h1>

      <div className='max-w-md mx-auto bg-white border border-gray-200 shadow-lg rounded-2xl p-6'>
        <h2 className='text-xl font-semibold text-gray-900 mb-4'>{symbol}</h2>

        {stock ? (
          <ul className='text-gray-700 space-y-2'>
            <li><span className='font-medium'>Open:</span> ₹{stock.open}</li>
            <li><span className='font-medium'>Close:</span> ₹{stock.close}</li>
            <li><span className='font-medium'>LTP:</span> ₹{stock.ltp}</li>
          </ul>
        ) : (
          <p className='text-red-500 text-sm'>Unable to fetch stock data. Please try again later.</p>
        )}
      </div>
    </div>
  );
};

export default MainPage;
