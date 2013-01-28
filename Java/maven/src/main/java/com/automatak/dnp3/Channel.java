package com.automatak.dnp3;

public interface Channel {

    void shutdown();

    Master addMaster(String loggerId, LogLevel level, DataObserver publisher);//, MasterStackConfig config);

    Outstation addOutstation(String loggerId, LogLevel level, CommandHandler cmdHandler);//, SlaveStackConfig config);
}
