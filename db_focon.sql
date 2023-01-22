-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 21, 2023 at 06:41 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_focon`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_penerimaan`
--

CREATE TABLE `tb_penerimaan` (
  `id` int(11) NOT NULL,
  `nama_pembayar` varchar(50) NOT NULL,
  `no_kwitansi` varchar(50) NOT NULL,
  `nama_admin` varchar(50) NOT NULL,
  `tanggal` date NOT NULL,
  `keterangan` varchar(100) NOT NULL,
  `jumlah` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tb_penerimaan`
--

INSERT INTO `tb_penerimaan` (`id`, `nama_pembayar`, `no_kwitansi`, `nama_admin`, `tanggal`, `keterangan`, `jumlah`) VALUES
(1, 'Kustoyo', 'M000001', 'Sudarmi', '2023-01-03', 'Pembayaran SPP', 100000),
(2, 'David', 'M000002', 'Davida', '2023-01-12', 'Pembayaran SPP', 2000000);

-- --------------------------------------------------------

--
-- Table structure for table `tb_pengeluaran`
--

CREATE TABLE `tb_pengeluaran` (
  `id` int(11) NOT NULL,
  `nama_pembayar` varchar(50) NOT NULL,
  `no_kwitansi` varchar(50) NOT NULL,
  `nama_admin` varchar(50) NOT NULL,
  `tanggal` date NOT NULL,
  `keterangan` varchar(50) NOT NULL,
  `jumlah` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tb_pengeluaran`
--

INSERT INTO `tb_pengeluaran` (`id`, `nama_pembayar`, `no_kwitansi`, `nama_admin`, `tanggal`, `keterangan`, `jumlah`) VALUES
(1, 'Kustoyo', 'M000001', 'Susilo', '2023-01-09', 'Lampu', 120000);

-- --------------------------------------------------------

--
-- Table structure for table `tb_transaksi`
--

CREATE TABLE `tb_transaksi` (
  `id` int(11) NOT NULL,
  `kode_transaksi` varchar(50) NOT NULL,
  `tanggal` date NOT NULL,
  `keterangan` varchar(100) NOT NULL,
  `jenis_transaksi` varchar(50) NOT NULL,
  `jumlah_pemasukan` int(11) DEFAULT NULL,
  `jumlah_pengeluaran` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tb_transaksi`
--

INSERT INTO `tb_transaksi` (`id`, `kode_transaksi`, `tanggal`, `keterangan`, `jenis_transaksi`, `jumlah_pemasukan`, `jumlah_pengeluaran`) VALUES
(1, 'TSK001', '2023-01-01', 'Try', 'masuk', 2000, NULL),
(2, 'PMSK002', '2023-01-11', 'Bayar PKH 1', 'keluar', NULL, 10),
(3, 'TSK003', '2023-01-10', 'Edit 2', 'masuk', 12222, NULL),
(4, 'TSK004', '2023-01-08', 's', 'masuk', 10000, NULL),
(5, 'PMSK005', '2023-01-21', 'SPP', 'keluar', NULL, 14);

-- --------------------------------------------------------

--
-- Table structure for table `tb_user`
--

CREATE TABLE `tb_user` (
  `id` int(11) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(250) NOT NULL,
  `level` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `tb_user`
--

INSERT INTO `tb_user` (`id`, `username`, `password`, `level`) VALUES
(1, 'admin', 'admin', 'admin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_penerimaan`
--
ALTER TABLE `tb_penerimaan`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tb_pengeluaran`
--
ALTER TABLE `tb_pengeluaran`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tb_transaksi`
--
ALTER TABLE `tb_transaksi`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tb_user`
--
ALTER TABLE `tb_user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tb_penerimaan`
--
ALTER TABLE `tb_penerimaan`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `tb_pengeluaran`
--
ALTER TABLE `tb_pengeluaran`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `tb_transaksi`
--
ALTER TABLE `tb_transaksi`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `tb_user`
--
ALTER TABLE `tb_user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
