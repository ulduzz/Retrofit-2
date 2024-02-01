package com.homework.network.di
import com.homework.network.api.ApiService
import com.homework.network.api.CampaignService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object DataLayerModule {
    @Provides
    @Singleton
    fun providerApiService(@FlightAnnotation retrofit: Retrofit) : ApiService {
        return retrofit.create(ApiService::class.java)
    }
    @Provides
    @Singleton
    fun provideCampaignService(@CampaignAnnotation retrofit: Retrofit) : CampaignService {
        return retrofit.create(CampaignService::class.java)
    }
}